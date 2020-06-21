package org.mobileProgramming.maintermproject.model;

import java.util.HashMap;
import java.util.Map;

public class ReservationModel {
        public String myUiddestinationUid;
        public String destinationUidmyUid;
        public String Salestitle;
        public String address;
        public String date;
        public String client;
        public String manager;

        public boolean uidOkay (String myUiddestinationUid, String client, String manager) {
                String a = client + manager;
                String b = manager + client;
                if(a.equals(myUiddestinationUid)||b.equals(myUiddestinationUid)) {
                        return true;
                }
                else {
                        return false;
                }
        }
}
