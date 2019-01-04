[
  {
    "environment": [
      { 
        "name": "SERVER_PORT",
        "value": "${app_port}"
      },
      { 
        "name": "SPRING_SECURITY_OAUTH2_CLIENT_REGISTRATION_COGNITO-CLIENT-1_CLIENT-SECRET",
        "value": "${cognito_secret}"
      }
    ],
    "name": "pp-app",
    "image": "${app_image}",
    "cpu": ${fargate_cpu},
    "memory": ${fargate_memory},
    "networkMode": "awsvpc",
    "logConfiguration": {
        "logDriver": "awslogs",
        "options": {
          "awslogs-group": "/ecs/pp-app",
          "awslogs-region": "${aws_region}",
          "awslogs-stream-prefix": "pp-log-stream"
        }
    },
    "portMappings": [
      {
        "containerPort": ${app_port},
        "hostPort": ${app_port}
      }
    ]
  }
]
