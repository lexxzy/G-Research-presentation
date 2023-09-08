package com.jendarey.jendareytech.service.implementation;

import com.jendarey.jendareytech.model.Voter;
import com.jendarey.jendareytech.repository.VoterRepository;
import com.jendarey.jendareytech.service.VoterService;
import java.net.InetAddress;
import java.net.UnknownHostException;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@Component
public class VoterServiceImpl implements VoterService {


    private final VoterRepository voterRepository;
    public VoterServiceImpl(VoterRepository voterRepository) {
        this.voterRepository = voterRepository;
    }




    @Override
    public void save(Voter voter) {
        voterRepository.save(voter);
    }

    @Override
    public String getIpAddress() {
        InetAddress ip ;

        try {
            ip = InetAddress.getLocalHost();
            System.out.println(ip);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }

        log.info("{}", "Your current IP address : " + ip);





        return ip.getHostAddress();
    }

    @Override
    public String getHostName() {
        InetAddress address;
        try {
            address = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }


        return address.getHostName();
    }





    @Override
    public List<Voter> getVoteDetails() {
      return  voterRepository.findAll();

    }
}
