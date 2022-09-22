package com.cloudVendor.cloudVendorApi.service.Impl;

import com.cloudVendor.cloudVendorApi.Model.CloudVendor;
import com.cloudVendor.cloudVendorApi.Repository.CloudVendorRepository;
import com.cloudVendor.cloudVendorApi.service.CloudVendorService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


class CloudServiceImplTest {


    @Mock
    private CloudVendorRepository cloudVendorRepository;
    private CloudVendorService cloudVendorService;
    AutoCloseable autoCloseable;
    CloudVendor cloudVendor;


    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        cloudVendorService = new CloudServiceImpl(cloudVendorRepository);

        cloudVendor = new CloudVendor("1","Amazon","USA","xxxxx");



    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void createCloudVendor() {


    }

    @Test
    void updateCloudVendor() {
    }

    @Test
    void deleteCloudVendor() {
    }

    @Test
    void getCloudVendor() {
    }

    @Test
    void getAllCloudVendors() {
    }
}