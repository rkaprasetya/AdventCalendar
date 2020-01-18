package com.raka.adventcalendar.presentation.presenter

import com.raka.adventcalendar.presentation.view.main.MainContracts
import org.junit.Assert.*
import org.junit.Test
import org.mockito.Mockito.mock

class MainPresenterImplTest{

    /**
     * Test to check whether the method returns current date
     * expected should be changed intu current date manually
     */
    @Test
    fun testGetCurrentDate(){
        val repository = mock(MainContracts.repository::class.java)
        val view = mock(MainContracts.view::class.java)
        val presenter = MainPresenterImpl(view,repository)
        val result = presenter.getCurrentDate()
        assertEquals("18 January 2020", result)
    }
}