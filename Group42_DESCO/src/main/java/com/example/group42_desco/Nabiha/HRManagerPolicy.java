package com.example.group42_desco.Nabiha;

public class HRManagerPolicy {
    private  String policy;

    public HRManagerPolicy(String policy) {
        this.policy = policy;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    @Override
    public String toString() {
        return "HRManagerPolicy{" +
                "policy='" + policy + '\'' +
                '}';
    }
}
