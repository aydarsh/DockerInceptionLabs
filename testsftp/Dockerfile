FROM ruby:alpine

RUN gem install net-sftp

COPY testSFTPone.rb /opt/

ENTRYPOINT ["/usr/local/bin/ruby", "/opt/testSFTPone.rb"]
