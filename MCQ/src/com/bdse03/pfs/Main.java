package com.bdse03.pfs;

/*
* made by I PUTU IKO PRASTYA INDRAYANA
*
* MCQ Test programs, you can develop this code
* run with JDK 17
*
* Start 5 January 2022 - End 15 January 2022
* */

public class Main {
    public static void main(String[] args) {
        //Get User Name
        GetUserName getName = new GetUserName();
        getName.userGetName();

        //User Picked MCQ
        UserPickedTest getTest = new UserPickedTest();
        getTest.userPickMcq();


    }

}
