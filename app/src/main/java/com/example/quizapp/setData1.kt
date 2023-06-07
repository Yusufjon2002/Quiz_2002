package com.example.quizapp

object setData1 {
    const val name:String="name"
    const val score:String="score"
    fun getQuestion1(): ArrayList<QuestionData1> {
        var que:ArrayList<QuestionData1> = arrayListOf()

        var question1=QuestionData1(
            1,
            "He ate everything that … on the table",
            "is leaving   ",
            "was left  ",
            ". were left  ",
            " is left",
            4
        )
        var question2=QuestionData1(
            2,
            "essential",
            "qizil",
            "joriy",
            "rost",
            "muhim",
            4
        )
        var question3=QuestionData1(
            3,
            "pressure",
            "bosim",
            "tun",
            "chaqmoq",
            "parcha",
            1
        )
        var question4=QuestionData1(
            4,
            "expose",
            "hisoblamoq",
            "eslatma",
            "fosh bo`lmoq",
            "avtomatlashtirish",
            3
        )
        var question5=QuestionData1(
            5,
            "define",
            "bog`liq bo`lmoq",
            "aniqlamoq",
            "tayanmoq",
            "sivilizatsiyalamoq",
            2
        )
        var question6=QuestionData1(
            6,
            "our president … at the station by the students yesterday",
            ". meet   ",
            "is met   ",
            ". have been met ",
            "was met",
            4
        )
        var question7=QuestionData1(
            7,
            "I went to the theatre last day. He said that…",
            "he is going",
            "he will go ",
            "he went to…",
            "he had gone to…",
            3
        )
        var question8=QuestionData1(
            8,
            "She … in the suburbs of Moscow",
            " live   ",
            "lives ",
            " is lives   ",
            "were lived",
            2
        )
        var question9=QuestionData1(
            9,
            "He …. afraid of cats",
            "am",
            "is",
            "are",
            "to be",
            2
        )
        var question10=QuestionData1(
            10,
            "What is the capital of England?",
            "Cardiff ",
            "London",
            "Belfast",
            "Edinburg",
            2
        )
        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        que.add(question6)
        que.add(question7)
        que.add(question8)
        que.add(question9)
        que.add(question10)
        return que
    }

}