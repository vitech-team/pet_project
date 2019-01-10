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
      },
      { 
        "name": "SPRING_SECURITY_OAUTH2_CLIENT_REGISTRATION_COGNITO-CLIENT-1_REDIRECT-URI-TEMPLATE",
        "value": "https://pplb.pproject.name/login/oauth2/code/cognito"
      },
      { 
        "name": "SERVER_USE-FORWARD-HEADERS",
        "value": "true"
      },
      { 
        "name": "SECURITY_REQUIRE-SSL",
        "value": "true"
      },
      { 
        "name": "SERVER_TOMCAT_REMOTE_IP_HEADER",
        "value": "x-forwarded-for"
      },
      { 
        "name": "SERVER_TOMCAT_PROTOCOL_HEADER",
        "value": "x-forwarded-proto"
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
