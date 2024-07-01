import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-usuario-registrado')
export class VistaUsuarioRegistrado extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; position: fixed; padding: 0px; margin: 0px; flex-direction: column; display: flex; justify-content: flex-start;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout id="cabecera" style="align-items: flex-start; flex-shrink: 0; z-index:9999; height: 60px; padding: 0px; margin: 0px; width: 100%;"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="flex-grow: 0; width: 100%; flex-shrink: 0; background-color: #ffffff; display: flex; overflow-y: auto; height: 100%; justify-content: flex-start;" id="vaadinHorizontalLayout"></vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
