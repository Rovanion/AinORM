package gov.polisen.orm.models;

public class DeploymentImage {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deployment_images.image_id
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    private Integer imageId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deployment_images.deployment_id
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    private Integer deploymentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deployment_images
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    public DeploymentImage(Integer imageId, Integer deploymentId) {
        this.imageId = imageId;
        this.deploymentId = deploymentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deployment_images.image_id
     *
     * @return the value of deployment_images.image_id
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    public Integer getImageId() {
        return imageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deployment_images.deployment_id
     *
     * @return the value of deployment_images.deployment_id
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    public Integer getDeploymentId() {
        return deploymentId;
    }
}