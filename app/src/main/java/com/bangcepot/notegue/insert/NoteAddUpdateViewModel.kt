package com.bangcepot.notegue.insert

import android.app.Application
import androidx.lifecycle.ViewModel
import com.bangcepot.notegue.repository.NoteRepository

class NoteAddUpdateViewModel(application: Application): ViewModel() {
    private val mNoteRepository: NoteRepository = NoteRepository(application)

    fun insert(note: com.bangcepot.notegue.database.Note){
        mNoteRepository.insert(note)
    }

    fun update(note: com.bangcepot.notegue.database.Note){
        mNoteRepository.update(note)
    }

    fun delete(note: com.bangcepot.notegue.database.Note){
        mNoteRepository.delete(note)
    }
}