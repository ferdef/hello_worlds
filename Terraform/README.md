# Steps

1. Ensure the right AWS profile is selected
    - Linux/Mac
        ```bash
        $AWS_PROFILE="<profile>"
        aws configure list
        ```
    - Windows
        ```powershell
        $Env::AWS_PROFILE="<profile>"
        aws configure list
        ```
1. Init Terraform
    ```bash
    terraform init
    ```
1. Validate configuration
    ```bash
    terraform validate
    ```
1. Check Execution Plan
    ```bash
    terraform plan
    ```
1. Apply changes
    ```bash
    terraform apply
    ```