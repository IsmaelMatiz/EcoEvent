package com.training.retojhonf.Model.Entities;

public class Constants {
    public static String dbName = "BDEcoEvent";

    public enum TableUsers{
        TabName("Users"),
        ColUserId("user_id"),
        ColFullName("full_name"),
        ColEmail("email"),
        ColPassword("password"),
        ColSecQuestion1("sec_question1"),
        ColAnsQuest1("answer_quest1"),
        ColSecQuestion2("sec_question2"),
        ColAnsQuest2("answer_quest2")
        ;

        private final String txtSqlInfo;

        TableUsers(String textInfo) {
            this.txtSqlInfo = textInfo;
        }

        public String getTextInfo() {
            return txtSqlInfo;
        }
    }
}
