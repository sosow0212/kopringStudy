package com.example.kopringstudy.entity

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
class Board (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?= null,

    @Column(nullable = false)
    var title: String? = null,

    @Column(nullable = false)
    var content: String? = null,
)