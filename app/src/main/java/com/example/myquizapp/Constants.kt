package com.example.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val  CORRECT_ANSWERS: String = "correct_ answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,"what conutry does this flag belong to ?",R.drawable.ic_flag_of_argentina

        ,"Argentina","Austrialia","USA","Austria",1

        )
        questionsList.add(que1)
        val que2 = Question(
            2,"what conutry does this flag belong to ?",R.drawable.ic_flag_of_australia

            ,"Argentina","Australia","USA","Austria",2

        )
        questionsList.add(que2)
        val que3 = Question(
            3,"what conutry does this flag belong to ?",R.drawable.ic_flag_of_belgium

            ,"Argentina","Austrialia","Belgium","Austria",3

        )
        questionsList.add(que3)
        val que4 = Question(
            4,"what conutry does this flag belong to ?",R.drawable.ic_flag_of_kuwait

            ,"Argentina","Austrialia","USA","kuwait",4

        )
        questionsList.add(que4)

        val que5 = Question(
            5,"what conutry does this flag belong to ?",R.drawable.ic_flag_of_brazil

            ,"Argentina","Brazil","USA","Austria",2

        )
        questionsList.add(que5)
        val que6 = Question(
            6,"what conutry does this flag belong to ?",R.drawable.ic_flag_of_denmark

            ,"Argentina","Austrialia","USA","Denmark",4

        )
        questionsList.add(que6)
        val que7 = Question(
            7,"what conutry does this flag belong to ?",R.drawable.ic_flag_of_fiji

            ,"Argentina","Austrialia","Fiji","Austria",3

        )
        questionsList.add(que7)
        val que8 = Question(
            8,"what conutry does this flag belong to ?",R.drawable.ic_flag_of_germany

            ,"Germany","Austrialia","USA","Austria",1

        )
        questionsList.add(que8)
        val que9 = Question(
            9,"what conutry does this flag belong to ?",R.drawable.ic_flag_of_india

            ,"Argentina","India","USA","Austria",2

        )
        questionsList.add(que9)

        return questionsList
    }
}