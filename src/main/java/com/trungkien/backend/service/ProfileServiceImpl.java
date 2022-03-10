package com.trungkien.backend.service;

import com.trungkien.backend.entity.Profile;
import com.trungkien.backend.repository.ProfileRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileServiceImpl implements ProfileService {

    private ProfileRepository profileRepository;

    @Autowired
    public ProfileServiceImpl(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public Profile createProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    @Override
    public List<Profile> getAllProfiles() {
        return profileRepository.findAll();
    }
}
