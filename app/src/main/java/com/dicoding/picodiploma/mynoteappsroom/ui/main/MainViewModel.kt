package com.dicoding.picodiploma.mynoteappsroom.ui.main

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.mynoteappsroom.database.Note
import com.dicoding.picodiploma.mynoteappsroom.repository.NoteRepository

class MainViewModel (application: Application) : ViewModel() {
    private val mNoteRepository: NoteRepository = NoteRepository(application)

    fun getAllNotes(): LiveData<List<Note>> = mNoteRepository.getAllNotes()
}