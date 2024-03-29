package com.example.stani.lesson8.factories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/example/stani/lesson8/factories/UseCaseProvide;", "", "()V", "provideGetRandomPersonUseCase", "Lcom/example/domain/usecases/GetPersonUseCase;", "provideGetStudentUseCase", "Lcom/example/domain/usecases/GetStudentsUseCase;", "provideSearchStudentUseCase", "Lcom/example/domain/usecases/SearchStudentsUseCase;", "presentation_debug"})
public final class UseCaseProvide {
    public static final com.example.stani.lesson8.factories.UseCaseProvide INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.domain.usecases.GetStudentsUseCase provideGetStudentUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.domain.usecases.SearchStudentsUseCase provideSearchStudentUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.domain.usecases.GetPersonUseCase provideGetRandomPersonUseCase() {
        return null;
    }
    
    private UseCaseProvide() {
        super();
    }
}