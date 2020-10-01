package com.example.workoutcompanion.model

import com.example.workoutcompanion.model.roomdb.StepCounts
import com.example.workoutcompanion.model.roomdb.StepCountsDao
import com.example.workoutcompanion.model.roomdb.User
import com.example.workoutcompanion.model.roomdb.UserDao

class AppRepository(private val userDao: UserDao, private val stepsDao: StepCountsDao) {
    val userData = userDao.getAllUsers()

    fun insertUser(user: User) = userDao.insert(user)
    fun insertSteps(steps: StepCounts) = stepsDao.insert(steps)
    fun updateSteps(date: String, steps: Float) = stepsDao.updateSteps(date, steps)

}
