package com.example.quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity1: AppCompatActivity() {
    private var Name:String? = null
    private var score:Int=0

    private var currentPosition:Int=1
    private var questionList:ArrayList<QuestionData1> ?=null
    private var selecedOpinion:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        Name=intent.getStringExtra(setData1.name)
        questionList=setData1.getQuestion1()

        setQuestion()
        opt_1.setOnClickListener{
            selectedopinionStyle(opt_1,1)
        }
        opt_2.setOnClickListener{
            selectedopinionStyle(opt_2,2)
        }
        opt_3.setOnClickListener{
            selectedopinionStyle(opt_3,3)
        }
        opt_4.setOnClickListener{
            selectedopinionStyle(opt_4,4)
        }
        submit.setOnClickListener {
            if (selecedOpinion!=0)
            {
                val question=questionList!![currentPosition-1]
                if (selecedOpinion!=question.correct_ans)
                {
                    setColor(selecedOpinion,R.drawable.wrong_question_opinion)
                }
                else{
                    score++
                }
                setColor(question.correct_ans,R.drawable.correct_question_opinion)
                if (currentPosition==questionList!!.size)
                    submit.text="Finish"
                else
                    submit.text="Go to Next"
            }else{
                currentPosition++
                when{
                    currentPosition<=questionList!!.size->{
                        setQuestion()
                    }
                    else->{
                        var intent= Intent(this,Resault::class.java)
                        intent.putExtra(setData1.name,Name.toString())
                        intent.putExtra(setData1.score,score.toString())
                        intent.putExtra("total size",questionList!!.size.toString())
                        startActivity(intent)
                        finish()
                    }
                }
            }
            selecedOpinion=0
        }

    }
    fun setColor(opt: Int,color:Int)
    {
        when(opt){
            1->{
                opt_1.background= ContextCompat.getDrawable(this,color)
            }
            2->{
                opt_2.background= ContextCompat.getDrawable(this,color)
            }
            3->{
                opt_3.background= ContextCompat.getDrawable(this,color)
            }
            4->{
                opt_4.background= ContextCompat.getDrawable(this,color)
            }
        }
    }
    fun setQuestion(){
        val question=questionList!![currentPosition-1]
        setOptionStyle()

        progress_bar.progress=currentPosition
        progress_bar.max=questionList!!.size
        progress_text.text="${currentPosition}"+"/"+"${questionList!!.size}"
        question_text.text=question.question
        opt_1.text=question.option_one
        opt_2.text=question.option_two
        opt_3.text=question.option_three
        opt_4.text=question.option_four
    }
    fun setOptionStyle(){
        var optionList:ArrayList<TextView> = arrayListOf()
        optionList.add(0,opt_1)
        optionList.add(1,opt_2)
        optionList.add(2,opt_3)
        optionList.add(3,opt_4)

        for (op in optionList)
        {
            op.setTextColor(Color.parseColor("#555151"))
            op.background= ContextCompat.getDrawable(this,R.drawable.question_opinion)
            op.typeface= Typeface.DEFAULT
        }
    }
    fun selectedopinionStyle(view: TextView, opt:Int){
        setOptionStyle()
        selecedOpinion=opt
        view.background= ContextCompat.getDrawable(this,R.drawable.selected_question_opinion)
        view.typeface= Typeface.DEFAULT_BOLD
        view.setTextColor(Color.parseColor("#000000"))
    }
}