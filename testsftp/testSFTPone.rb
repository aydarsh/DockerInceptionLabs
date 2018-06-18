require 'net/sftp'

begin
Net::SFTP.start('80.211.31.63', 'sftpuser', :password => 'Passw0rd', :port => 2222) do |sftp|
  sftp.dir.foreach("/") do |entry|
    puts entry.longname
  end
end

rescue StandardError => e
 puts "Unable to connect: #{ e.class.name }, #{ e.message }"
end
