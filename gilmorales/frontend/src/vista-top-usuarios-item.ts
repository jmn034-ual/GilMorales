import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-top-usuarios-item')
export class VistaTopUsuariosItem extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; justify-content: center;" id="vaadinHorizontalLayout" theme="spacing-s" dir="layoutItem">
 <vaadin-vertical-layout theme="spacing" id="fotoPerfil" style="align-self: center;"></vaadin-vertical-layout>
 <vaadin-button theme="tertiary" id="nombreUsuario" style="align-self: center;">
   Tertiary 
 </vaadin-button>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
