package com.sha.k8s_argocd_helm_demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("test-app")
    public ResponseEntity<String> testAppStatus() {
        return ResponseEntity.ok("ok");
    }
}
