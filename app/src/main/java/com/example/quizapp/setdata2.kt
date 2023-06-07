package com.example.quizapp

object setdata2 {
    const val name:String="name"
    const val score:String="score"
    fun getQuestion2(): ArrayList<QuestionData2> {
        var que:ArrayList<QuestionData2> = arrayListOf()

        var question1=QuestionData2(
            1,
            "She is interested ____learning French.",
            "in",
            "for",
            "on",
            "to",
            1
        )
        var question2=QuestionData2(
            2,
            "You should ____ your homework.",
            "make",
            "do",
            "job",
            "work",
            2
        )
        var question3=QuestionData2(
            3,
            "Choose the correct option.",
            "I don`t imagine why he said that. ",
            "I can`t imagine why he said that.",
            "I might imagine why he said that.",
            "I haven`t been imaginning  why he said that.",
            2
        )
        var question4=QuestionData2(
            4,
            "How long ____ English.",
            "have to learn",
            "are you learning",
            "have you been learning",
            "you learn",
            3
        )
        var question5=QuestionData2(
            5,
            "Ann`s house is somewhere in the ____ of the railway station.",
            "quarter",
            "region",
            "district",
            "vicinity",
            4
        )
        var question6=QuestionData2(
            6,
            "pressure",
            "bosim",
            "tun",
            "chaqmoq",
            "parcha",
            1
        )
        var question7=QuestionData2(
            7,
            "define",
            "bog`liq bo`lmoq",
            "aniqlamoq",
            "tayanmoq",
            "sivilizatsiyalamoq",
            2)
        var question8=QuestionData2(
            1,
            "He ate everything that … on the table",
            "is leaving   ",
            "was left  ",
            ". were left  ",
            " is left",
            4
        )
        var question9=QuestionData2(
            7,
            "I went to the theatre last day. He said that…",
            "he is going",
            "he will go ",
            "he went to…",
            "he had gone to…",
            3
        )
        var question10=QuestionData2(
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