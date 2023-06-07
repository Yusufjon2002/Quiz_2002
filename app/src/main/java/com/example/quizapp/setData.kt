package com.example.quizapp

object setData {
    const val name:String="name"
    const val score:String="score"
    fun getQuestion(): ArrayList<QuestionData> {
        var que:ArrayList<QuestionData> = arrayListOf()

        var question1=QuestionData(
            1,
            "She is interested ____learning French.",
            "in",
            "for",
            "on",
            "to",
            1
        )
        var question2=QuestionData(
            2,
            "You should ____ your homework.",
            "make",
            "do",
            "job",
            "work",
            2
        )
        var question3=QuestionData(
            3,
            "Choose the correct option.",
            "I don`t imagine why he said that. ",
            "I can`t imagine why he said that.",
            "I might imagine why he said that.",
            "I haven`t been imaginning  why he said that.",
            2
        )
        var question4=QuestionData(
            4,
            "How long ____ English.",
            "have to learn",
            "are you learning",
            "have you been learning",
            "you learn",
            3
        )
        var question5=QuestionData(
            5,
            "Ann`s house is somewhere in the ____ of the railway station.",
            "quarter",
            "region",
            "district",
            "vicinity",
            4
        )
        var question6=QuestionData(
            6,
        "My favorite sport is …. basketball",
            "a",
            "am",
            "the",
            "--",
            4
        )
        var question7=QuestionData(
            7,
        "This is the car park … you can leave  your car.",
        "when",
            "who",
            "where",
            "which",
            1
        )
        var question8=QuestionData(
            8,
        "This newspaper is different … other newspapers.",
            "to",
            "of",
            "from",
            "with",
            3
        )
        var question9=QuestionData(
            9,
        "At Christmas children hang … at the end of their beds.",
        "a cap",
            "a bag",
            "a stocking",
            "a pillow",
            3
        )
        var question10=QuestionData(
            10,
            "I … to the park yesterday",
            "went",
            "go",
            "played",
            "did",
            1

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