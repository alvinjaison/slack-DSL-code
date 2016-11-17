job('slack_notification') {
  publishers {
    slackNotifier {
      room('slack_channel_name')
      notifyAborted(true)
      notifyFailure(true)
      notifyNotBuilt(true)
      notifyUnstable(true)
      notifyBackToNormal(true)
      notifySuccess(true)
      notifyRepeatedFailure(true)
      startNotification(true)
      includeTestSummary(false)
      includeCustomMessage(false)
      customMessage(null)
      buildServerUrl('http://jenkins.test.com')
      sendAs(null)
      commitInfoChoice('NONE')
      teamDomain(null)
      authToken('xxxxxxxxxxxxxxxxxxxxxxxx')
    }
  }
  steps {shell("""
#!/bin/bash
pwd
""")
    }
}
