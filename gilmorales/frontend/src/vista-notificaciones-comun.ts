import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-notificaciones-comun')
export class VistaNotificacionesComun extends LitElement {
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
<vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 100%; height: 100%;">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 100%;">
   <h3 id="tituloNotificacion" style="align-self: flex-start;">Titulo</h3>
   <vaadin-vertical-layout id="listaNotificaciones" style="width: 100%;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
