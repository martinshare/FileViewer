package mbitsystem.com.fileviewer.data

import io.reactivex.Observable
import mbitsystem.com.fileviewer.data.model.File
import mbitsystem.com.fileviewer.state.FileState

interface Interactor {
    fun getFiles(): Observable<FileState>
    fun getFilesAsceding(): Observable<FileState>
    fun getFilesDesceding(): Observable<FileState>
    fun deleteFile(file: File): Observable<Unit>
}