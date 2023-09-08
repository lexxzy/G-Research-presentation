package com.jendarey.jendareytech.service;


import com.jendarey.jendareytech.model.Voter;
import java.util.List;

public interface VoterService {

  public void save(Voter voter);

  public String getIpAddress();
  public String getHostName();

  public List<Voter> getVoteDetails();
}
