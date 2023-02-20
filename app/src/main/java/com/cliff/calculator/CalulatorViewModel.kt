package com.cliff.calculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalulatorViewModel:ViewModel() {
    var state by mutableStateOf(CalculatorState())
        private set
}


