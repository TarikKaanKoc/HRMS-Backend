package com.koc.hrms.core.utilities;

import com.koc.hrms.entities.concretes.JobSeeker;
import com.koc.hrms.ServiceMessageSimulation.MailManager;

public class FakeMailAdapter implements FakeMailService {
    @Override
    public void mail(JobSeeker jobSeeker) {
        MailManager trial = new MailManager();
        trial.message(jobSeeker.getFirstName());
    }
}