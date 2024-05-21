package com.clement.simplelist.screen

import androidx.lifecycle.ViewModel
import com.clement.simplelist.data.planets
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class SimpleListViewModel: ViewModel() {
    private var _data: MutableStateFlow<List<String>> = MutableStateFlow(planets)
    val data = _data.asStateFlow()
}