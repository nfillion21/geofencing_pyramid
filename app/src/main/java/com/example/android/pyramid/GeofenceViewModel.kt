package com.example.android.pyramid

import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class GeofenceViewModel(state: SavedStateHandle) : ViewModel() {
    private val _geofenceEnteredOrExited = state.getLiveData(GEOFENCE_ENTERED_OR_EXITED_KEY, false)
    private val _geofenceActivated = state.getLiveData(GEOFENCE_ACTIVATED_KEY, false)
    private val geofenceEnteredOrExited: LiveData<Boolean>
        get() = _geofenceEnteredOrExited

    val geofenceEnteredOrExitedResourceId = Transformations.map(geofenceEnteredOrExited) {
        val entered = geofenceEnteredOrExited?.value ?: false
        if (entered)
        {
            R.string.content_text_entered_rue_des_pyramides
        }
        else
        {
            R.string.content_text_exited_rue_des_pyramides
        }
    }

    fun updateEnteredOrExited(exited: Boolean) {
        _geofenceEnteredOrExited.value = exited
    }

    fun geofenceActivated() {
        _geofenceActivated.value = true
    }

    fun geofenceIsActive() = _geofenceActivated.value == true
}

private const val GEOFENCE_ACTIVATED_KEY = "geofenceActivated"
private const val GEOFENCE_ENTERED_OR_EXITED_KEY = "geofenceEnteredOrExited"
