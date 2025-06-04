output "instance_id" {
  description = "EC2 Instance ID"
  value       = aws_instance.web_server.id
}

output "instance_public_ip" {
  description = "Instance public IP"
  value       = aws_instance.web_server.public_ip
}

output "instance_public_dns" {
  description = "Instance Public DNS"
  value       = aws_instance.web_server.public_dns
}

output "website_url" {
  description = "Web Site URL"
  value       = "http://${aws_instance.web_server.public_ip}"
}
