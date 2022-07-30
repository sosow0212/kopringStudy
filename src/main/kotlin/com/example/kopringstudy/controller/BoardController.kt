package com.example.kopringstudy.controller

import com.example.kopringstudy.entity.Board
import com.example.kopringstudy.service.BoardService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class BoardController(
    private val boardService: BoardService
) {

    @GetMapping("/boards")
    fun findAllBoards(): ResponseEntity<List<Board>> {
        return ResponseEntity(boardService.findAll(), HttpStatus.OK)
    }

    @GetMapping("/boards/{id}")
    fun findBoard(@PathVariable("id") id: Long): ResponseEntity<Board> {
        return ResponseEntity<Board>(boardService.findById(id), HttpStatus.OK)
    }

    @PostMapping("/boards")
    fun write(@RequestBody board: Board): ResponseEntity<Board> {
        return ResponseEntity<Board>(boardService.write(board), HttpStatus.CREATED)
    }

    @PutMapping("/boards/{id}")
    fun edit(@PathVariable id: Long, @RequestBody board: Board): ResponseEntity<Board> {
        return ResponseEntity(boardService.edit(id, board), HttpStatus.OK)
    }

    @DeleteMapping("/boards/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<String> {
        return ResponseEntity<String>(boardService.delete(id), HttpStatus.OK)
    }
}