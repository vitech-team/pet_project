# Set up cloudwatch group and log stream and retain logs for 30 days
resource "aws_cloudwatch_log_group" "pp_log_group" {
  name              = "/ecs/pp-app"
  retention_in_days = 30

  tags {
    Name = "pp-log-group"
  }
}

resource "aws_cloudwatch_log_stream" "pp_log_stream" {
  name           = "pp-log-stream"
  log_group_name = "${aws_cloudwatch_log_group.pp_log_group.name}"
}
