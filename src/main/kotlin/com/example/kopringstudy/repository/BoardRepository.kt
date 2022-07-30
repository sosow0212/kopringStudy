package com.example.kopringstudy.repository

import com.example.kopringstudy.entity.Board
import org.springframework.data.jpa.repository.JpaRepository

interface BoardRepository : JpaRepository<Board, Long> {
}