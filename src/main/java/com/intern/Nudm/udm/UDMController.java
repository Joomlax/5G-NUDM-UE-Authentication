package com.intern.Nudm.udm;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("security-information/generate-auth-data")
public class UDMController {

    private final UDMService udmService;

    @Autowired
    public UDMController(UDMService udmService) {
        this.udmService = udmService;
    }

    @GetMapping()
    public List<UDM> getUDM(){
        return udmService.getUDM();
    }

    @PostMapping()
    @ResponseBody
    public ResponseEntity<AuthenticationInfoResult> postUDM(@RequestBody UDM udm){
        udmService.addUDM(udm);
        AvType avType = new AvType("à EAP_AKA_PRIME");
        AuthType authType = new AuthType("EAP_AKA_PRIME");
        AvEapAkaPrime avEapAkaPrime = new AvEapAkaPrime(
                avType,
                "à 81491af7c2d0fe40b2aedb47b8ae586d",
                "à af5e87e029b2eb10",
                "à da900923ed11c3abaa538b423268c0b9",
                "à d899df7ae59577f88b357c76e8ba92ef",
                "à a5f8ee390e6b69343694460d6bf22d01"
        );
        AuthenticationVector authenticationVector = new AuthenticationVector(avEapAkaPrime);
        AuthenticationInfoResult authenticationInfoResult = new AuthenticationInfoResult(
                authType,
                null,
                authenticationVector,
                "à imsi-001001000000001"

        );
        return ResponseEntity.status(201).body(authenticationInfoResult);
    }

}
