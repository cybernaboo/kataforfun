package com.kata.kataforfun.services

import org.springframework.stereotype.Component

@Component
class KataForFunService {

    fun convertNumber(inputNumber: Int): String {
            var result = ""

            // divisors have high precedence
            if (inputNumber % 3 == 0) {
                result += "Kata"
            }
            if (inputNumber % 5 == 0) {
                result += "For"
            }

            // the content is analyzed in the order of appearance
            val numberString = inputNumber.toString()
            for (digitChar in numberString) {

                if (digitChar == '5') {
                    result += "For"
                }
                if (digitChar == '3') {
                    result += "Kata"
                }
                if (digitChar == '7') {
                    result += "Fun"
                }
            }

            return if (result.isEmpty()) {
                inputNumber.toString()
            } else {
                result
            }
    }
}
