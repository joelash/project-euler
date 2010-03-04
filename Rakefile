require 'rubygems'
require 'rake'

rule '' do |prob|
  return unless prob.name =~ /^(prob-)?(?<num>\d+)$/
  match = Regexp.last_match
  file_base_name = "prob-#{match[1]}"
  puts "***Running #{file_base_name}***"
  puts "Ruby output:#{$/}\t#{run_jruby file_base_name}" if Dir.entries('jruby/lib').include? "#{file_base_name}.rb"
  puts "Clojure output:#{$/}\t#{run_clj file_base_name}" if Dir.entries('clojure/lib').include? "#{file_base_name}.clj"
end

private
def run_clj(file_base)
  file = File.dirname(__FILE__) + "/clojure/lib/#{file_base}.clj"
  `java -cp /opt/jars/clojure-contrib.jar:/opt/jars/clojure.jar clojure.main #{file}`
end

def run_jruby(file_base)
  file = File.dirname(__FILE__) + "/jruby/lib/#{file_base}.rb"
  `jruby #{file}`
end
