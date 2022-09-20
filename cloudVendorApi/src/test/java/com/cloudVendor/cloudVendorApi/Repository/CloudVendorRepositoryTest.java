package com.cloudVendor.cloudVendorApi.Repository;

import com.cloudVendor.cloudVendorApi.Model.CloudVendor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
class CloudVendorRepositoryTest {

    //TODO: given -when -then
    @Autowired
    private CloudVendorRepository cloudVendorRepository;

    CloudVendor cloudVendor;


    @BeforeEach
    void setUp() {
        cloudVendor = new CloudVendor("1","Amazon","USA","xxxxx");
        cloudVendorRepository.save(cloudVendor);

    }

    @AfterEach
    void tearDown() {
        cloudVendor=null;
        cloudVendorRepository.deleteAll();

    }

    //test case SUCCESS

    @Test
    void testFindByVendorName_Found(){
        List<CloudVendor> cloudVendorList = cloudVendorRepository.findByVendorName("Amazon");

        assertThat(cloudVendorList.get(0).getVendorId()).isEqualTo(cloudVendor.getVendorId());
        assertThat(cloudVendorList.get(0).getVendorAddress()).isEqualTo(cloudVendor.getVendorAddress());

    }


    //test case fAILURE

    @Test
    void testFindByVendorName_NotFound(){
        List<CloudVendor> cloudVendorList = cloudVendorRepository.findByVendorName("GCP");
        assertThat(cloudVendorList.isEmpty()).isTrue();

    }

    //test case fAILURE


    @Test
    void testFindByVendorName_NotFounds(){
        List<CloudVendor> cloudVendorList = cloudVendorRepository.findByVendorName("GCP");
        assertThat(cloudVendorList.isEmpty()).isFalse();

    }


}