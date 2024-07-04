import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-notificaciones-comentarios-item')
export class VistaNotificacionesComentariosItem extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-horizontal-layout class="content" style="width: 100%; justify-content: center; align-items: center;" id="vaadinHorizontalLayout" theme="spacing">
 <vaadin-avatar id="vaadinAvatar" style="align-self: center;"></vaadin-avatar>
 <vaadin-vertical-layout id="vaadinVerticalLayout">
  <vaadin-button theme="tertiary" id="nombreUser">
    Tertiary 
  </vaadin-button>
  <label id="labelComentario" style="align-self: center;">Comentario del usuario...</label>
 </vaadin-vertical-layout>
 <vaadin-button id="botonMeGusta" style="align-self: center;">
   Me Gusta 
 </vaadin-button>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
