package com.realtomjoney.birthdaycountdown

import java.time.Duration
import java.time.LocalDate
import java.time.temporal.ChronoUnit
import kotlin.math.ceil

class BirthdayCalculator(private val birthday: LocalDate) {
    private val timeNow: LocalDate = LocalDate.now()

    fun calculatePreciseAge() =
        ((Duration.between(birthday.atStartOfDay(), timeNow.atStartOfDay()).get(ChronoUnit.SECONDS) / 3.154e+7))


    fun calculateTimeUntilBirthday() =
        "You will be turning ${ceil(calculatePreciseAge())} in ${((ceil(calculatePreciseAge()) - calculatePreciseAge()) * 365)} days"
}