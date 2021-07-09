package com.intern.Nudm.udm;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UDMService {
    public List<UDM> getUDM(){
        return List.of(
                new UDM(
                        ,
                        "ausf"
                )
        );
    }

    public void addUDM(UDM udm){
        System.out.println(udm);
    }
}
