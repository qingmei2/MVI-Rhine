package com.github.qingmei2.sample.ui.main.home

import androidx.paging.PagedList
import com.github.qingmei2.sample.entity.ReceivedEvent

sealed class HomeResult {

    sealed class InitialResult : HomeResult() {
        data class Success(val pagedList: PagedList<ReceivedEvent>) : InitialResult()
        data class Failure(val error: Throwable) : InitialResult()
        object InFlight : InitialResult()
    }

    object ScrollToTopResult : HomeResult()

    data class FloatActionButtonVisibleResult(val visible: Boolean) : HomeResult()
}