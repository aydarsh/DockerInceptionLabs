require 'net/sftp'

begin
Net::SFTP.start('<server>', '<username>', :password => '<password>', :port => 2222) do |sftp|
  sftp.dir.foreach("/") do |entry|
    puts entry.longname
  end
end

rescue StandardError => e
 puts "Unable to connect: #{ e.class.name }, #{ e.message }"
end
