fun main(args: Array<String>){

    //for (i in 0..10){

        //if (i % 2 == 0){
            //continue
        //}
        //println(i)
    //}

    //MENU BARU

    loopForRow@ for (row in 0 until 3){
        println(row)
        loopForCoulumns@ for (coulumn in 0 until 2){
            if (coulumn == 0) {
                break@loopForRow
            }
            println(coulumn)

        }
    }
}