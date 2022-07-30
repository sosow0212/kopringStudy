package com.example.kopringstudy.controller

import com.example.kopringstudy.entity.Board
import com.example.kopringstudy.service.BoardService
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
    fun findAllBoards() = boardService.findAll();

    @GetMapping("/boards/{id}")
    fun findBoard(@PathVariable("id") id: Long) = boardService.findById(id);

    @PostMapping("/boards")
    fun write(@RequestBody board: Board) = boardService.write(board);

    @PutMapping("/boards/{id}")
    fun edit(@PathVariable id: Long, @RequestBody board: Board) = boardService.edit(id, board);

    @DeleteMapping("/boards/{id}")
    fun delete(@PathVariable id: Long) = boardService.delete(id);
}