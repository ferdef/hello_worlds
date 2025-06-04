variable "aws_region" {
  description = "AWS Region where resources are created"
  type        = string
  default     = "eu-west-1"
}

variable "instance_type" {
  description = "EC2 Instance Type"
  type        = string
  default     = "t2.micro"
}
