package com.trungkien.backend.service;

import java.util.List;

import com.trungkien.backend.entity.Profile;

public interface ProfileService {
    Profile createProfile(Profile profile);

    List<Profile> getAllProfiles();
}
