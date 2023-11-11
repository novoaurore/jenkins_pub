pipeline {
    agent {
  label 'Gemini'
}

parameters {
  choice choices: ['BMW', 'Audi', 'Mercedes', 'VolksWagen'], 
  description: 'what are your favorite makes of car?', name: 'Make'
  booleanParam defaultValue: true, 
  description: 'do you like to travel?', 
  name: 'Yes'
  password defaultValue: 'admin', 
  description: 'admin password', 
  name: 'admin_pass'
  text defaultValue: 'I love learning Jenkins!!!!', 
  description: 'message', name: 'message'
  file description: 'file location', name: '/home/jenkins/'
}


    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('mkdir') {
            steps {
                mkdir 'Omega'
                cd 'Omega'
                touch 'my_code.txt'
            }
        }
    }
}
