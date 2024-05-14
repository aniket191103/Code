import webapp2
from google.appengine.ext.webapp import template

class MainPage(webapp2.RequestHandler):
    def get(self):
        template_values = {}
        path = 'index.html'
        self.response.out.write(template.render(path, template_values))

    def post(self):
        input_strings = self.request.get('input_strings').split()
        sorted_letters = sort_all_letters(input_strings)
        template_values = {
            "sorted_letters": sorted_letters
        }
        path = 'results.html'
        self.response.out.write(template.render(path, template_values))

def sort_all_letters(strings):
    all_letters = ''.join(strings)
    sorted_letters = ''.join(sorted(all_letters))
    return sorted_letters

app = webapp2.WSGIApplication([('/', MainPage)], debug=True)
