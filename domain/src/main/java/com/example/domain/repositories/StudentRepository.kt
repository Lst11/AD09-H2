package com.example.domain.repositories

import com.example.domain.entity.Student
import com.example.domain.entity.StudentSearch
import io.reactivex.Completable
import io.reactivex.Observable

interface StudentRepository : BaseRepository {
    fun get(): Observable<List<Student>>
    fun search(search: StudentSearch): Observable<List<Student>>
    fun update(student: Student): Completable
    fun delete(studentId: String): Completable

}