package com.jay.josaeworld.domain

import com.google.firebase.database.ValueEventListener
import com.jay.josaeworld.data.repository.DataRepository
import javax.inject.Inject

class GetInitTeamDataUseCase @Inject constructor(
    private val repository: DataRepository
) {
    operator fun invoke(valueEventListener: ValueEventListener) {
        repository.getInitTeamData(valueEventListener)
    }
}
